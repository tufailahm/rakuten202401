import ReactDOM from 'react-dom';
import React from 'react'
class VisitorCount extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            labelButton : "Click Me",
            visitCount: 0
        }
        this.clickMe3 = this.clickMe3.bind(this);
    }

    userAdded() {
        this.setState(prevState => ({
            visitCount: prevState.visitCount + 1  ,
            labelButton : 'Clicked'
        }))
        console.log("Visitor count :" + this.state.visitCount)
    }
    addFourUser() {
        this.userAdded();
        this.userAdded();
        this.userAdded();
        this.userAdded();
    }
    clickMe1() {
        console.log("Clickme 1 called")
    }
    clickMe2() {
        console.log("Clickme 2 called")
    }
    clickMe3() {
        this.setState(prevState => ({
            visitCount: prevState.visitCount + 1  //2 seconds
        }))
        console.log("Clickme 3 called")
    }
    clickMe4 = ()  =>  {
        this.setState(prevState => ({
            visitCount: prevState.visitCount + 1 , //2 seconds
            labelButton : 'Button Clicked'

        }))
        console.log("Clickme 4 called")
    }
    componentDidMount(){
        console.log("Component Did Mounted ")
    }
    componentDidUpdate(){
        console.log("Component Updated called  ")

    }
    shouldComponentUpdate(){
        console.log("shouldComponentUpdate called")
        return true;
    }
    render() {
        console.log("render called")
        return (
            <div>
                Visitor Counter - {this.state.visitCount}
                <br />
                <br />
                <button onClick={() => this.addFourUser()}>Increment</button>
                <button onClick={this.clickMe1.bind(this)}>ClickMe1 - Bind Render</button>
                <button onClick={() => this.clickMe2()}>ClickMe2 - Bind using arrow</button>
                <button onClick={this.clickMe3}>ClickMe3 - Bind in cons</button>
                <button onClick={this.clickMe4}>{this.state.labelButton}</button>
            </div>
        );
    }

}

export default VisitorCount;