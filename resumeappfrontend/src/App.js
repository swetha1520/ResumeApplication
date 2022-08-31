import logo from './logo.svg';
import './App.css';
import Resume from './components/Resume';
import EditContact from './components/EditContact';
import { BrowserRouter, Routes,Route } from 'react-router-dom';
function App() {
  return (
    <BrowserRouter>
    <Routes>
      <Route path="/" element={<Resume/>}></Route>
      <Route path="/editContact" element={<EditContact/>}></Route>
    </Routes>
    </BrowserRouter>
    
    
  );
}

export default App;
