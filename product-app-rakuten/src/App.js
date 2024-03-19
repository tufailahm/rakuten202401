import logo from './logo.svg';
import './App.css';
import { Routes, Route } from 'react-router-dom';
import { BrowserRouter as Router } from 'react-router-dom';
import ProductComponent from './components/ProductComponent'
import  Customer  from './customer'
function App() {
  return (
    <Router>
    <>	
      <h1>Product Application</h1>
      <Routes>
        <Route path="/" element={<ProductComponent />}></Route>
        <Route path="/products" element={<ProductComponent />}/>
        <Route path="/customers" element={< Customer />}/>
        <Route path="/products/:productId" element={<ProductComponent />}/>

      </Routes>
    </>
  </Router>

  );
}

export default App;
