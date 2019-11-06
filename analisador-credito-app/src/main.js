import React from "react";
import {Switch, Route, BrowserRouter} from 'react-router-dom'
import NovaProposta from "./components/proposta/nova-proposta";
import Home from "./components/home/home";

const Main = () => (
        <Switch>
            <Route exact path="/" component={Home} />
            <Route exact path="/nova-proposta" component={NovaProposta} />
        </Switch>
);

export default Main;
