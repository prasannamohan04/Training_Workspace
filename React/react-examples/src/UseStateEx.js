import { useState } from "react";

function UseStateEx() {
    const [clr, setClr] = useState('red');
    return (
        <div>
            <h1>Selected color is <font color = {clr} > Colour </font></h1>
            <button onClick={()=> setClr("blue")}>Blue</button>
            <button onClick={()=> setClr("yellow")}>Yellow</button>
        </div>
    )
}
export default UseStateEx;