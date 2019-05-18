import React from 'react';
import axios from 'axios';
import { CreditCardList } from './creditcard-list';
export class CreditCard extends React.Component {

    constructor() {
        super();
        this.state = {
            data: [],
            pageNo: 1,
            filter: '',
            activePage: 0,
            name: ''
        }
    }
    componentDidMount() {
        this.fetchItems();
    }

    //fetch data from server
    
    fetchItems() {
        axios.get('/credit'+'?name='+this.state.name+'&page='+this.state.pageNo)
        .then(res =>{this.setState({ data : res.data.content})});
    }

    // //fetch data on dropdown select
    // filter(e) {
    //     this.setState({ filter: e });
    //     this.fetchItems(this.state.pageNo, this.state.searchBy, e);
    // }

    // //fetch data on change in searchby
    // handleChange(e) {
    //     let value = e.target.value;
    //     value = value.replace(/ +/g, "");
    //     this.setState({ searchBy: value })
    //     this.fetchItems(this.state.pageNo, value, this.state.filter);
    // }
    render() {
        return (

            <div className="container">
                <div className="column">
                    <div>

                        <input type="text" className="form-control col-5"
                            id="formGroupExampleInput" onChange={(e) => { this.handleChange(e) }}
                            placeholder="Search names.."></input>
                            
                        <CreditCardList data = {this.state.data}/>
                        
                    </div>
                </div>
            </div>
        )
    }
}
