import React from 'react';
import axios from 'axios';
import { Line } from 'react-chartjs-2';
export class CreditCardDetail extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            details: {}
        }
    }

    componentDidMount() {
        const id = this.props.match.params.id;
        axios.get('/credit/' + id).then((res) => {
            this.setState({ details: res.data });
        })
    }

    render() {
        const repaymentData = {
            labels: ['April', 'May', 'June', 'July', 'August', 'September'],
            datasets: [
                {
                    responsive: true,
                    maintainAspectRatio: true,
                    label: 'Repayment Status',
                    fill: false,
                    lineTension: 0.1,
                    backgroundColor: 'rgba(75,192,192,0.4)',
                    borderColor: 'rgba(75,192,192,1)',
                    borderCapStyle: 'butt',
                    borderDash: [],
                    borderDashOffset: 0.0,
                    borderJoinStyle: 'miter',
                    pointBorderColor: 'rgba(75,192,192,1)',
                    pointBackgroundColor: '#fff',
                    pointBorderWidth: 1,
                    pointHoverRadius: 5,
                    pointHoverBackgroundColor: 'rgba(75,192,192,1)',
                    pointHoverBorderColor: 'rgba(220,220,220,1)',
                    pointHoverBorderWidth: 2,
                    pointRadius: 1,
                    pointHitRadius: 10,
                    data: [this.state.details.pay_6, this.state.details.pay_5, this.state.details.pay_4,
                        this.state.details.pay_3, this.state.details.pay_2, this.state.details.pay_0]
                }
            ]
        };

        const billData = {
            labels: ['April', 'May', 'June', 'July', 'August', 'September'],
            datasets: [
                {
                    responsive: true,
                    maintainAspectRatio: true,
                    label: 'Bill Amount',
                    fill: false,
                    lineTension: 0.1,
                    backgroundColor: 'rgba(75,192,192,0.4)',
                    borderColor: 'rgba(75,192,192,1)',
                    borderCapStyle: 'butt',
                    borderDash: [],
                    borderDashOffset: 0.0,
                    borderJoinStyle: 'miter',
                    pointBorderColor: 'rgba(75,192,192,1)',
                    pointBackgroundColor: '#fff',
                    pointBorderWidth: 1,
                    pointHoverRadius: 5,
                    pointHoverBackgroundColor: 'rgba(75,192,192,1)',
                    pointHoverBorderColor: 'rgba(220,220,220,1)',
                    pointHoverBorderWidth: 2,
                    pointRadius: 1,
                    pointHitRadius: 10,
                    data: [this.state.details.bill_amt6, this.state.details.bill_amt5, this.state.details.bill_amt4,
                        this.state.details.bill_amt3, this.state.details.bill_amt2, this.state.details.bill_amt1]
                }
            ]
        };

        console.log(this.state.details);

        return (
            <div className="container column">
                <div className="column">
                    <div>Name: {this.state.details.name}</div>
                    <div>Sex: {this.state.details.sex}</div>
                    <div>Education: {this.state.details.education}</div>
                    <div>Age: {this.state.details.age}</div>
                    <div className="row">
                    <div className="col-md-4">
                    <Line data={repaymentData} width={400}
                        height={400}
                        options={{ maintainAspectRatio: false }} />
                        </div>
                        <div className="col-md-4">
                        <Line data={billData} width={100}
                        height={50}
                        options={{ maintainAspectRatio: false }} />  
                        </div>
                    </div>
                   
                   

                    
                </div>
            </div>
        )
    }

}