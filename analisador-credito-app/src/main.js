import React from "react";
import {Switch, Route} from 'react-router-dom'
import NovaProposta from "./components/proposta/nova-proposta";
import Home from "./components/home/home";
import ListaPropostas from "./components/proposta/lista-propostas";

const Main = () => (
        <Switch>
            <Route exact path="/" component={Home} />
            <Route exact path="/nova-proposta" component={NovaProposta} />
            <Route exact path="/lista-propostas" component={ListaPropostas} />
        </Switch>
);

export default Main;
