import React from 'react';
import { Link } from 'react-router-dom';
const CreditCardInfo = (props) => {
    const credit = props.data;
    return (
        <Link style={{ textDecoration: 'none' }} to={"/creditdetails/" + credit.id}>
        <div className="row col-7 card">
            <div><span>Name:</span><span>{credit.name}</span></div>
            <div><span>Sex:</span><span>{credit.sex}</span></div>
            <div><span>Education:</span><span>{credit.education}</span></div>
            <div><span>Balance:</span><span>{credit.limit_bal}</span></div>
        </div>
        </Link>
    )

}
export default CreditCardInfo;