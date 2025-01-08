import Header from '../components/Header';
import bacImage from '../images/manpro.jpeg'
import About from './About';
import Contact from './Contact';

import Products from './Products';
const Home = () => {
    return (
        <>
        <div className="home">
            <div className=" home-primary">
                <div className="home-image">
                <img src={bacImage} alt="computer" className="image"/>
                </div>
               
              <div className="home-text">
              <h2 className="home-heading">Empowering Your Digital Journey</h2>
              <p className="home-para">At MegaComputify, we believe in providing the perfect computer for every need.
             Whether you're a tech enthusiast, a professional, or just getting started,
             our wide range of computers ensures you'll find the right fit. 
             Elevate your experience with cutting-edge technology, exceptional performance,
             and reliable customer support.</p>

              </div>

            </div>
          
        
        </div>
        <About/>
        <Products/>
        <Contact/>
      
     


        </>

        
    )
}

export default Home;