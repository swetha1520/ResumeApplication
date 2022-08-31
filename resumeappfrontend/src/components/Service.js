import axios from 'axios';

class Service
{
    getDetails()
    {
        
        return axios.get("http://localhost:8080/userDetails");
    }
    editDetails(user)
    {
        return axios.put("http://localhost:8080/editDetails",user);
    }
}
export default new Service();