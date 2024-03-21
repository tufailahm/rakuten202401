import React from 'react'
class Customer extends React.Component
{
    constructor(){
        super();
        console.log("Constructor called")
        this.state = {
            message : 'Welcome Guest'
        }
    }
    subscribeMe(){
        console.log("Subscribe me called")
        this.setState({
            message : "Subscribed Successfully!!"
        })
    }
    render(){
        return <div>
              <h1>Hello {this.props.name}</h1>
              <h1>Message : { this.state.message } </h1>
              <button onClick={ () => this.subscribeMe()}>Subscribe</button>
            </div>
    }
}
export default Customer;
