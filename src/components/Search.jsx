import CartOrder from "./CartOrder";
import Product from "./Product";

const Search = () => {

    return (
        <div className="search-container">
            <input type="text" placeholder="Search..." />
            <button>Search</button>
            <button>Reset</button>
            <button>Sort</button>
            <button>Filter</button>
            <button>Export</button>

            <table>
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Name</th>
                        <th>Email</th>
                        <th>Phone</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>1</td>
                        <td>John Doe</td>
                        <td>john.doe@example.com</td>
                        <td>123-456-7890</td>
                    </tr>
                    <tr>
                        <td>2</td>
                        <td>Jane Smith</td>
                        <td>jane.smith@example.com</td>
                        </tr>
                </tbody>
                <tfoot>
                    <tr>
                        <td colSpan="4">Total Records: 2</td>
                    </tr>
                </tfoot>

            </table>    
            
         
        </div>

    )
    

}
export default Search;