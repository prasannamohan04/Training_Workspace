import axios from "axios";

const BOOK_URI = "http://localhost:8387/library/book";
const USER_URI = "http://localhost:8387/library/user";
function BookService(){
    const getBooks = () =>{
        return axios.get(BOOK_URI+"/allbook");
    };
    const addBook = (book) => {
        return axios.post(BOOK_URI+"/addbook",book);
    };
    const delBook = (id) => {
        return axios.delete(BOOK_URI + `/deletebook/${id}`);
    }
    const getBookById = (id) => {
        return axios.get(BOOK_URI+`/bookbyid/${id}`);
    }
    const editBook = (book) => {
        return axios.put(BOOK_URI+"/updatebook",book);
    }
    const loginValidate = async (login) => {
         return await axios.post(USER_URI+"/loginvalidate",login);
    }

    return Object.freeze({getBooks,addBook,delBook,getBookById,editBook,loginValidate});
}

export default BookService;