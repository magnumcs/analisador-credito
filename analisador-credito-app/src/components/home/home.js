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
                        <h5 className="card-title">Panel title</h5>
                        <p className="card-text">Some quick example text to build on the panel title and make up the
                            bulk of the panel's content.</p>
                    </div>
                </div>
                </MDBCol>
                <MDBCol md="8"></MDBCol>
            </MDBRow>
        </MDBContainer>
    </div>
);

export default Home;
