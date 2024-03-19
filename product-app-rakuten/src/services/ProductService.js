import axios from 'axios'

const PRODUCT_API_URL = 'http://localhost:9090/product'
class ProductService {

    retrieveAllProducts() {
        return axios.get(`${PRODUCT_API_URL}`);
    }

    deleteProduct(productId) {
        return axios.delete(`${PRODUCT_API_URL}/${productId}`);
    }
}

export default new ProductService()