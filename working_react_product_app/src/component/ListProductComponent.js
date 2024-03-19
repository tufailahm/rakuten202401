import React, { Component } from 'react';
import ProductService from '../service/ProductService';

class ListProductComponent extends Component {
    constructor(props) {
        super(props);
        this.refreshProducts = this.refreshProducts.bind(this)
        this.deleteProductClicked = this.deleteProductClicked.bind(this)
        this.updateProductClicked = this.updateProductClicked.bind(this)
        this.addProductClicked = this.addProductClicked.bind(this)
        this.state = {
            products: [],
            message: null
        }
    }

    componentDidMount() {
        this.refreshProducts();
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

    updateProductClicked(productId) {
        console.log('update ' + productId)
        this.props.history.push(`/products/${productId}`)
    }

    addProductClicked() {
        this.props.history.push(`/products/-1`)
    }

    render() {
        return (
            <div className="container">
                {this.state.message && <div className="alert alert-success">{this.state.message}</div>}
                <h3>List of Products</h3>
                <br/>
                <div className="container">
                    <table className="table">
                        <thead>
                            <tr>
                                <th>Product Id</th>
                                <th>Product Name</th>
                                <th>Quantity On Hand</th>
                                <th>Price</th>
                                <th>Delete</th>
                                <th>Update</th>
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
                    <br/>
                    <br/>
                    <br/>

                    <div className="row">
                        <button className="btn btn-success" onClick={this.addProductClicked}>Add Product</button>
                    </div>
                </div>
            </div>
        );
    }
}

export default ListProductComponent;