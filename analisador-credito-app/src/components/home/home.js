import React from "react";
import {MDBCol, MDBContainer, MDBRow} from "mdbreact";

const Home = () => (
    <div className="container">
        <MDBContainer>
            <MDBRow>
                <MDBCol md="2"></MDBCol>
                <MDBCol md="8">
                <div className="card">
                    <div className="card-body">
                        <h5 className="card-title"><strong>Analisador de Créditos</strong></h5>
                        <h5><strong>Descrição</strong></h5>
                        <p className="card-text">Projeto de um sistema para análise de créditos pessoal, baseado em
                        informações cadastrais. Ao clicar na opção "Nova Proposta", inserir as informações na página de cadastro e clicar no botão
                        "Analisar" a proposta de crédito será aprovado ou recusada. Caso seja aprovado será mostrada a faixa
                        de crédido. Caso seja reprovada exibirá o motivo.</p>
                        <h5><strong>Autor</strong></h5>
                        <p>Magnum Adelano Gonçalves de Faria</p>
                        <h5><strong>Github</strong></h5>
                        <a href="https://github.com/magnumcs">https://github.com/magnumcs</a>
                        <h5><strong>Linkedin</strong></h5>
                        <a href="https://www.linkedin.com/in/magnum-adelano-b2535992/">https://www.linkedin.com/in/magnum-adelano-b2535992/</a>
                    </div>
                </div>
                </MDBCol>
                <MDBCol md="8"></MDBCol>
            </MDBRow>
        </MDBContainer>
    </div>
);

export default Home;
