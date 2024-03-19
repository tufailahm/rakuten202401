import React, { Component } from 'react';
import ProductService from './../services/ProductService'
import { withRouter } from "react-router-dom";
import { useHistory } from "react-router-dom";
import { useNavigate } from 'react-router-dom';
import PropTypes from "prop-types";
class ProductComponent extends Component {
    static contextTypes = {
        router: PropTypes.object
      }
      constructor(props, context) {
        super(props, context);
        
        this.state = {
            products: [],
            message: null
        }
        this.refreshProducts = this.refreshProducts.bind(this)
        this.updateProductClicked = this.updateProductClicked.bind(this)
        this.addProductClicked = this.addProductClicked.bind(this)

    }

    componentDidMount() {
        this.refreshProducts();
    }


    updateProductClicked(productId) {
        this.context.router.history.push(`/products/${productId}`);
    //    const history = useHistory();
       // const navigate = useNavigate();
        //navigate('/products/${productId}');
        console.log('update ' + productId)
     //   history.push(`/products/${productId}`)
       // const navigate = useNavigate();
    }

    addProductClicked() {
       // const history = useHistory();
       // history.push(`/products/-1`)
    }



    refreshProducts() {
        ProductService.retrieveAllProducts()
            .then(
                response => {
                    console.log(response);
                    this.setState({ products: response.data })
                }
            )
    }
    deleteProductClicked(productId) {
        ProductService.deleteProduct(productId)
            .then(
                response => {
                    this.setState({ message: `Delete of product ${productId} Successful` })
                    this.refreshProducts()
                }
            )
    }
    render() {
        return (
            <div>
  <div className="container">
                {this.state.message && <div className="alert alert-success">{this.state.message}</div>}
                    <h3>All Products</h3>
                    <div className="container">
                        <table className="table">
                            <thead>
                                <tr>
                                    <th>Product Id</th>
                                    <th>Product Name</th>
                                    <th>Quantity On Hand</th>
                                    <th>Price</th>
                                </tr>
                            </thead>
                            <tbody>
                                {
                                    this.state.products.map(
                                        product =>
                                            <tr key={product.productId}>
                                                <td>{product.productId}</td>
                                                <td>{product.productName}</td>
                                                <td>{product.quantityOnHand}</td>
                                                <td>{product.price}</td>
                                                <td><button className="btn btn-warning"
                                                onClick={() => this.deleteProductClicked(product.productId)}>
                                                Delete</button>
                                            </td>
                                            <td><button className="btn btn-success"
                                                onClick={() => this.updateProductClicked(product.productId)}>
                                                Update</button></td>


                                            </tr>
                                    )
                                }
                            </tbody>
                        </table>
                    </div>
                </div>
                <div className="row">
                        <button className="btn btn-success" onClick={this.addProductClicked}>Add Product</button>
                    </div>

            </div>
        );
    }
}

export default ProductComponent;