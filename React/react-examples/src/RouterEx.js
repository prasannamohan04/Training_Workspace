import { BrowserRouter, Link, Route, Routes } from "react-router";

export default function RouterEx(){
    return (
        <div>
            <BrowserRouter>
            <div>
                <h2>Router Example</h2>
                <Link to={'/home'}>Home</Link>
                <Link to={'/about'}>About</Link>
                <Link to={'/contact'}>Contact</Link>
                <Routes>
                    <Route exact element={<Home/>} path="/home"></Route>
                    <Route exact element={<About/>} path="/about"></Route>
                    <Route exact element={<Contact/>} path="/contact"></Route>
                </Routes>
            </div>
            </BrowserRouter>
        </div>
    );
}
export function Home() {
    return(<div><h2>This is Home component</h2> </div>);
}
function About() {
    return(<div><h2>This is About us</h2> </div>);
}
function Contact() {
    return(<div> <h2> This is Contact us</h2></div>);
}