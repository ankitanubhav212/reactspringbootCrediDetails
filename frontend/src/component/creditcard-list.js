import React from 'react';
//import axios from 'axios';
import CreditCardInfo from './creditcard-info';
export class CreditCardList extends React.Component {

    constructor(props) {
        super(props);
    }

    getcards() {
        return this.props.data.map((data, index) => {
            return (
                <CreditCardInfo key={index} data={data} />
            )
        });
    }

    render() {
        return (
            <div className="container">
                {this.getcards()}
            </div>

        )
    }
}