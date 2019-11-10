import React, {Component} from "react";
import { MDBContainer, MDBRow, MDBCol, MDBBtn, MDBCard, MDBCardBody} from 'mdbreact';
import axios from 'axios';
import {estados, genero, estadoCivil} from '../../util/enums'

class NovaProposta extends Component {
    constructor (props) {
        super(props);
        this.state = {
            nome: '',
            cpf: '',
            idade: '',
            genero: '',
            estadoCivil: '',
            estado: '',
            dependentes: '',
            renda: ''
        };
    }

    genero = genero;
    estadoCivil = estadoCivil;
    estados = estados;

    handleSubmit = async (event) => {
        event.preventDefault();
        axios.post(`http://localhost:8080/propostas/nova`, this.state)
            .then(res => {
                console.log(res);
                console.log(res.data);
                this.props.history.push('/lista-propostas');
            });
        console.log(this.state);
    };

    render() {
        return (
            <MDBContainer>
                <MDBRow>
                    <MDBCol md="2"></MDBCol>
                    <MDBCol md="8">
                        <MDBCard>
                            <MDBCardBody>
                                <form onSubmit={this.handleSubmit}>
                                    <p className="h4 text-center py-4">Nova Proposta</p>
                                    <label htmlFor="nome" className="grey-text font-weight-light">Nome</label>
                                    <input type="text" id="nome" className="form-control" value={this.state.nome} onChange={(event => this.setState({nome: event.target.value}))}/>
                                    <label htmlFor="cpf" className="grey-text font-weight-light">CPF</label>
                                    <input type="text" id="cpf" className="form-control" value={this.state.cpf} onChange={(event => this.setState({cpf: event.target.value}))}/>
                                    <label htmlFor="idade" className="grey-text font-weight-light">Idade</label>
                                    <input type="text" id="idade" className="form-control" value={this.state.idade} onChange={(event => this.setState({idade: event.target.value}))}/>
                                    <label htmlFor="genero" className="grey-text font-weight-light">Gênero</label>
                                    <br/>
                                    <div>
                                        <select className="browser-default custom-select" onChange={(event => this.setState({genero: event.target.value}))}>
                                            <option>Escolha uma opção</option>
                                            {
                                                this.genero.map(genero =>
                                                <option value={genero.value}>{genero.label}</option>)
                                            }
                                        </select>
                                    </div>
                                    <br/>
                                    <label htmlFor="estadoCivil" className="grey-text font-weight-light">Estado civil</label>
                                    <br/>
                                    <div>
                                        <select className="browser-default custom-select" onChange={(event => this.setState({estadoCivil: event.target.value}))}>
                                            <option>Escolha uma opção</option>
                                            {
                                                this.estadoCivil.map(estadoCivil =>
                                                    <option value={estadoCivil.value}>{estadoCivil.label}</option>)
                                            }
                                        </select>
                                    </div>
                                    <br/>
                                    <br/>
                                    <label htmlFor="estado" className="grey-text font-weight-light">Estado</label>
                                    <br/>
                                    <div>
                                        <select className="browser-default custom-select" onChange={(event => this.setState({estado: event.target.value}))}>
                                            <option>Escolha uma opção</option>
                                            {
                                                this.estados.map(estado =>
                                                    <option value={estado.value}>{estado.label}</option>)
                                            }
                                        </select>
                                    </div>
                                    <br/>
                                    <label htmlFor="dependentes" className="grey-text font-weight-light">Dependentes</label>
                                    <input type="text" id="dependentes" className="form-control" value={this.state.dependentes} onChange={(event => this.setState({dependentes: event.target.value}))}/>
                                    <label htmlFor="renda" className="grey-text font-weight-light">Renda</label>
                                    <input type="text" id="renda" className="form-control" value={this.state.renda} onChange={(event => this.setState({renda: event.target.value}))}/>
                                    <div className="text-center py-4 mt-3">
                                        <MDBBtn className="btn btn-outline-dark-green" type="submit">
                                            Analisar
                                        </MDBBtn>
                                    </div>
                                </form>
                            </MDBCardBody>
                        </MDBCard>
                    </MDBCol>
                    <MDBCol md="2"></MDBCol>
                </MDBRow>
            </MDBContainer>
        );
    }
}

export default NovaProposta;
