import axios from 'axios'

const PRODUCT_API_URL = 'http://localhost:9090/product'
class ProductService {

    retrieveAllProducts() {
        return axios.get(`${PRODUCT_API_URL}`);
    }

    deleteProduct(productId) {
        return axios.delete(`${PRODUCT_API_URL}/${productId}`);
    }
    retrieveProduct(productId) {
        console.log("Product id in service :" + productId);
        return axios.get(`${PRODUCT_API_URL}/${productId}`);
    }
    updateProduct(product) {
        return axios.put(`${PRODUCT_API_URL}`, product);
    }

    createProduct(product) {
        return axios.post(`${PRODUCT_API_URL}`, product);
    }
}

export default new ProductService()