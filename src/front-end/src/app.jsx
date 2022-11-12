import React from 'react';

const App = () => {
    return (
        <div>

            <h1>Davlatlar</h1>
            <div className="row">
                <div className="col-md-6 offset-3">
                    <table className="table table-dark">
                        <thead>
                        <tr>
                            <th scope="col">#</th>
                            <th scope="col">Davlat nomi</th>
                            <th scope="col">Qit'a nomi</th>
                            <th scope="col">Action</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <th scope="row">1</th>
                            <td>Uzbekistan</td>
                            <td>Asia</td>
                            <td>
                                <button className="btn btn-warning">edit</button>
                                <button className="btn btn-danger">delete</button>
                            </td>
                        </tr>
                        </tbody>
                    </table>

                </div>



            </div>

        </div>
    );
};

export default App;