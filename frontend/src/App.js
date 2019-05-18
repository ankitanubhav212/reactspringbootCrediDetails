import React from 'react';
import { BrowserRouter, Route, Redirect } from 'react-router-dom';
import { CreditCard } from './component/creditcard';
import { CreditCardDetail } from './component/creditcard-details';
import './App.css';

function App() {
  return (
    <BrowserRouter>
      <div>
        <header className="app-header">
          Credit Card Details
      </header>
        {/* <Route exact path='' render={() => <Redirect to='/creditcards' />} /> */}
        <Route exact path='/' component={CreditCard} />
        <Route exact path='/creditdetails/:id' component={CreditCardDetail} />
      </div>
    </BrowserRouter>
  );
}

export default App;
