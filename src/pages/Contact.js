import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import { faEnvelope, faPhone, faMapMarkerAlt } from '@fortawesome/free-solid-svg-icons';
import { faFacebookF, faInstagram, faLinkedinIn, faXTwitter } from '@fortawesome/free-brands-svg-icons';

const Contact = () => {
    return (
        <div className="contact-container">
            <h1>Contact US</h1>
            <div className="contact-info">
                <div className="contact-item">
                    <FontAwesomeIcon icon={faEnvelope} className="icon" />
                    <h2>Email</h2>
                    <p>Abdishaikh52@gmail.com</p>
                    <p>Abdishaikh32@gmail.com</p>
                </div>
                <div className="contact-item">
                    <FontAwesomeIcon icon={faPhone} className="icon" />
                    <h2>Phone</h2>
                    <p>+252612772229</p>
                    <p>+252612772229</p>
                </div>
                <div className="contact-item">
                    <FontAwesomeIcon icon={faMapMarkerAlt} className="icon" />
                    <h2>Location</h2>
                    <p>Street Makka Al-Mukarmma</p>
                    <p>Mogadishu-Somalia</p>
                </div>
            </div>
            <div className="social-icons">
                <a href="https://www.facebook.com" target="_blank" rel="noreferrer" className="facebook">
                    <FontAwesomeIcon icon={faFacebookF} className="social-icon" />
                </a>
                <a href="https://www.instagram.com" target="_blank" rel="noreferrer" className="instagram">
                    <FontAwesomeIcon icon={faInstagram} className="social-icon " />
                </a>
                <a href="https://www.linkedin.com" target="_blank" rel="noreferrer" className="linkedin">
                    <FontAwesomeIcon icon={faLinkedinIn} className="social-icon" />
                </a>
                <a href="https://www.twitter.com" target="_blank" rel="noreferrer" className="twitter">
                    <FontAwesomeIcon icon={faXTwitter} className="social-icon" />
                </a>
            </div>
            <footer>
                <div className="footer-content">
                    <div className="logo">MegaComputify</div>
                    <div className="footer-links">
                        <a href="/privacy-policy">Privacy Policy</a>
                        <a href="/terms-of-service">Terms Of Service</a>
                        <a href="/cookies-settings">Cookies Settings</a>
                    </div>
                    <p>© 2024 MegaComputify. All rights reserved.</p>
                </div>
            </footer>
        </div>
    );
};

export default Contact;
