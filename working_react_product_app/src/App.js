import React from 'react';
import { Switch, Route } from 'react-router-dom';
import { BrowserRouter as Router } from 'react-router-dom';
import './App.css';
import ListProductComponent from './component/ListProductComponent';
import ProductComponent from './component/ProductComponent';

function App() {
  return (
    <Router>
      <>
        <h1><i><u><p align="center">Mohammad Tufail Ahmed's Product App</p></u> </i></h1>
        <br/>
        <br/>
        <br/>
        <Switch>
          <Route path="/" exact component={ListProductComponent} />
          <Route path="/products" exact component={ListProductComponent} />
          <Route path="/products/:productId" component={ProductComponent} />
        </Switch>
      </>
    </Router>

  );
}

export default App;
