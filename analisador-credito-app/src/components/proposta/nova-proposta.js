import React from "react";
import { MDBContainer, MDBRow, MDBCol, MDBBtn, MDBCard, MDBCardBody} from 'mdbreact';

const techCompanies = [
    { label: "Apple", value: 1 },
    { label: "Facebook", value: 2 },
    { label: "Netflix", value: 3 },
    { label: "Tesla", value: 4 },
    { label: "Amazon", value: 5 },
    { label: "Alphabet", value: 6 },
];

const NovaProposta = () => {
    return (
        <MDBContainer>
            <MDBRow>
                <MDBCol md="2"></MDBCol>
                <MDBCol md="8">
                    <MDBCard>
                        <MDBCardBody>
                            <form>
                                <p className="h4 text-center py-4">Nova Proposta</p>
                                <label htmlFor="defaultFormCardNameEx" className="grey-text font-weight-light">Nome</label>
                                <input type="text" id="defaultFormCardNameEx" className="form-control"/>
                                <label htmlFor="defaultFormCardNameEx" className="grey-text font-weight-light">CPF</label>
                                <input type="text" id="defaultFormCardNameEx" className="form-control"/>
                                <label htmlFor="defaultFormCardNameEx" className="grey-text font-weight-light">Idade</label>
                                <input type="text" id="defaultFormCardNameEx" className="form-control"/>
                                <label htmlFor="defaultFormCardNameEx" className="grey-text font-weight-light">Gênero</label>
                                <br/>
                                <div>
                                    <select className="browser-default custom-select">
                                        <option>Escolha uma opção</option>
                                        <option value="1">Masculino</option>
                                        <option value="2">Feminino</option>
                                    </select>
                                </div>
                                <br/>
                                <label htmlFor="defaultFormCardNameEx" className="grey-text font-weight-light">Estado civil</label>
                                <br/>
                                <div>
                                    <select className="browser-default custom-select">
                                        <option>Escolha uma opção</option>
                                        <option value="1">Solteiro</option>
                                        <option value="2">Casado</option>
                                        <option value="3">Viúvo</option>
                                        <option value="4">Divorciado</option>
                                    </select>
                                </div>
                                <br/>
                                <label htmlFor="defaultFormCardNameEx" className="grey-text font-weight-light">Estado</label>
                                <br/>
                                <div>
                                    <select className="browser-default custom-select">
                                        <option>Escolha uma opção</option>
                                        <option value="1">SC</option>
                                        <option value="2">SP</option>
                                        <option value="3">MA</option>
                                        <option value="4">RJ</option>
                                    </select>
                                </div>
                                <br/>
                                <label htmlFor="defaultFormCardNameEx" className="grey-text font-weight-light">Dependentes</label>
                                <input type="text" id="defaultFormCardNameEx" className="form-control"/>
                                <label htmlFor="defaultFormCardNameEx" className="grey-text font-weight-light">Renda</label>
                                <input type="text" id="defaultFormCardNameEx" className="form-control"/>
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
};

export default NovaProposta;
