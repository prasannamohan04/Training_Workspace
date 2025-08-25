

import { BrowserRouter, Route, Routes } from 'react-router-dom';
import GetAllBook from './components/GetAllBook';
import AddBook from './components/AddBook';
import EditBook from './components/EditBook';
import LoginUser from './components/LoginUser';
import Header from './components/Header';

function App() {
  return (
    <div className="App">
      <BrowserRouter>
      <Header />
      <Routes>
        <Route path = '/getallbooks' element = {<GetAllBook />}/>
        <Route path = "/addbook" element = {<AddBook />}/>
        <Route path = "/edit/:id" element = {<EditBook />} />
        <Route path="/login" element={<LoginUser />} />
        </Routes>
        </BrowserRouter>
    </div> 
  );  
}


export default App;
