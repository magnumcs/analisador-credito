import React, {Component} from "react";
import {
    MDBContainer,
    MDBRow,
    MDBCol,
    MDBCardBody,
    MDBTable,
    MDBTableBody,
    MDBTableHead,
    MDBCard
} from 'mdbreact';
import axios from 'axios';

class ListaPropostas extends Component {

    state = {
        propostas: []
    };

    componentDidMount() {
        axios.get(`http://localhost:3000/propostas`)
            .then(res => {
                const propostas = res.data;
                this.setState({ propostas });
            })
    }

    render () {
        return (
            <MDBContainer>
                <MDBRow>
                    <MDBCol md="12">
                        <MDBCard>
                            <MDBCardBody>
                                <MDBTable>
                                    <MDBTableHead color="default-color" textWhite>
                                        <tr>
                                            <th>#</th>
                                            <th>Nome</th>
                                            <th>Idade</th>
                                            <th>Sexo</th>
                                            <th>Estado Civil</th>
                                            <th>Estado</th>
                                            <th>Dependentes</th>
                                            <th>Renda R$</th>
                                            <th>Resultado Análise</th>
                                            <th>Limite</th>
                                        </tr>
                                    </MDBTableHead>
                                    <MDBTableBody>
                                        {
                                            this.state.propostas.map((item) =>
                                                <tr>
                                                    <td> {item.id} </td>
                                                    <td> {item.nome} </td>
                                                    <td> {item.idade} </td>
                                                    <td> {item.genero} </td>
                                                    <td> {item.estadoCivil} </td>
                                                    <td> {item.estado} </td>
                                                    <td> {item.dependentes} </td>
                                                    <td> {item.renda} </td>
                                                    <td> {item.respostaProposta} </td>
                                                    <td> {item.detalheResposta} </td>
                                                </tr>)
                                        }
                                    </MDBTableBody>
                                </MDBTable>
                            </MDBCardBody>
                        </MDBCard>
                    </MDBCol>
                </MDBRow>
            </MDBContainer>
        );
    };
}

export default ListaPropostas;
