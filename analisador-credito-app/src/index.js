import React from 'react';
import ReactDOM from 'react-dom';
import * as serviceWorker from './serviceWorker';
import "@fortawesome/fontawesome-free/css/all.min.css";
import "bootstrap-css-only/css/bootstrap.min.css";
import "mdbreact/dist/css/mdb.css";
import App from "./app";
import { BrowserRouter } from 'react-router-dom'

ReactDOM.render(<BrowserRouter>
                    <App />
                </BrowserRouter>,
    document.getElementById('root'));

serviceWorker.unregister();
