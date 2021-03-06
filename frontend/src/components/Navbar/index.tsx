import { ReactComponent as IconeGithub } from 'assets/img/github.svg';
import './styles.css';
function Navbar() {
    return (
        <header>
            <nav className="container">
                <div className="dsmovie-nav-content">
                    <h1>DSMovie</h1>
                    <a href="https://github.com/vcosmusjoao">
                        <div className='dsmovie-contact-container'>
                            <IconeGithub />
                            <p className='dsmovie-contact-link'>/vcosmusjoao</p>
                        </div>
                    </a>
                </div>
            </nav>
        </header>
    );
}

export default Navbar;