import React, { Component } from 'react';
import ProductService from '../service/ProductService';
import { Form, Formik, Field, ErrorMessage } from 'formik';

class ProductComponent extends Component {

    constructor(props) {
        super(props)
        this.onSubmit = this.onSubmit.bind(this)
        this.validateProductForm = this.validateProductForm.bind(this)
        this.state = {
            productId: this.props.match.params.productId,
            productName: '',
            quantityOnHand: '',
            price: ''
        }
    }
    componentDidMount() {
        console.log("componentDidMount() called")
        console.log(this.state.productId)
        if (this.state.productId === -1) {
            return
        }

        ProductService.retrieveProduct(this.state.productId)
            .then(response => this.setState({
                productName: response.data.productName,
                quantityOnHand: response.data.quantityOnHand,
                price: response.data.price
            })
            )
    }

    onSubmit(values) {
        let product = {
            productId: values.productId,
            productName: values.productName,
            quantityOnHand: values.quantityOnHand,
            price: values.price
        }
        console.log("HH1")
        if (this.state.productId === -1) 
        {
            console.log("HH2")
            ProductService.createProduct(product)
                .then(() => this.props.history.push('/products'))
        }
        else {
            ProductService.updateProduct(product)
                .then(() => this.props.history.push('/products'))
        }
        console.log(values);
    }

    validateProductForm(values) {
        let errors = {}
        if (!values.productName) {
            errors.productName = 'Enter a product name'
        }
        else if (!values.quantityOnHand) {
            errors.quantityOnHand = 'Enter Quantity On Hand'
        }
        else if (!values.price) {
            errors.price = 'Enter Price'
        }
        else if (values.productName.length < 5) {
            errors.productName = 'Enter atleast 5 Characters in product name'
        }

        return errors
    }

    render() {

        let { productId, productName, quantityOnHand, price } = this.state

        return (
            <div>

                <div className="container">
                    <Formik
                        initialValues={{ productId, productName, quantityOnHand, price }}
                        validateOnChange={false}
                        validateOnBlur={false}
                        validate={this.validateProductForm}
                        enableReinitialize={true}
                        onSubmit={this.onSubmit}
                    >

                        <Form>
                            <ErrorMessage name="productName" component="div"
                                className="alert alert-warning" />
                            <ErrorMessage name="quantityOnHand" component="div"
                                className="alert alert-warning" />
                            <ErrorMessage name="price" component="div"
                                className="alert alert-warning" />
                            <fieldset className="form-group">
                                <label>Product Id</label>
                                <Field className="form-control" type="text"
                                    name="productId" />
                            </fieldset>
                            <fieldset className="form-group">
                                <label>Product Name</label>
                                <Field className="form-control" type="text"
                                    name="productName" />
                            </fieldset>
                            <fieldset className="form-group">
                                <label>QuantityOnHand</label>
                                <Field className="form-control" type="text" name="quantityOnHand" />
                            </fieldset>
                            <fieldset className="form-group">
                                <label>Price</label>
                                <Field className="form-control" type="text" name="price" />
                            </fieldset>
                            <button className="btn btn-success" type="submit">{this.state.productId === -1  ? 'Save':'Update' }</button>

                        </Form>

                    </Formik>
                </div>
            </div>
        );
    }
}

export default ProductComponent;