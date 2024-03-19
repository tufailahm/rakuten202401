import axios from 'axios'

const PRODUCT_API_URL = 'http://localhost:9090/product'
//const PRODUCT_API_URL = 'http://localhost:8080/mongorest-api-0.0.1-SNAPSHOT/product'
//const PRODUCT_API_URL = 'http://localhost:9090/product-app-alstrom-rest/rest/product'
class ProductDataService {

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

export default new ProductDataService()