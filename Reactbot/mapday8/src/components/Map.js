import React from 'react';

function Map(){
    const i = [100,200,300,400];
    return(
        <div>
            <ul>
                {this.i.map((j) => <li>{j}</li>)}
            </ul>
        </div>
    );
}
export default Map;