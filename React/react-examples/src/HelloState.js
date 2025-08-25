import { Component } from "react";

class HelloState extends Component{
    constructor(){
        super();
        this.state = {
            empname : "mohan",
            salary : 7500
        }

    };

    changeData = () => {
        this.setState({
            empname : "jack",
            salary : 4500
        })
    }
    render(){
        return(
            <div>
                <h1>welcome {this.state.empname} Your salary is {this.state.salary} </h1>
                <button onClick={()=>this.changeData()}>click here</button>
            </div>
        )
    }
}
export default HelloState;