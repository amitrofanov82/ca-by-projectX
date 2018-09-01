import React, {Component} from 'react';
import axios from 'axios';

constructor (props) {
    this.state = {
        items: [],
    }
    axios.get('http://localhost:8080/your/dir/test.json')
        .then(res => {
            this.setState({ items: res.data });
        });
}
class Test extends Component {
    console.log(this.state.items);
    render () {
        return (

        )
    }
};

export default Test;