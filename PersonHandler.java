 

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
        String result = "";
        // assume there is a `counter`
        int counter = 0;
        // while `counter` is less than length of array
        while(counter < personArray.length){
            // begin loop
            Person currentPerson = personArray[counter];
                // use `counter` to identify the `current Person` in the array
            String s = currentPerson.toString();
                // get `string Representation` of `currentPerson`
            result = result + s;
                // append `stringRepresentation` to `result` variable
            counter++;
            // end loop
        }
        return result;
    }



    public String forLoop() {
        String result = "";
        // identify initial value
        // identify terminal condition
        // identify increment
        for(int i = 0; i < personArray.length; i++ ){
            String s = personArray[i].toString();
            result = result + s;
        }
        return result;
    }



    public String forEachLoop() {
        String result = "";
        // identify array's type
        // identify array's variable-name

        for(Person s : personArray){
            result = result + s.toString();
        }

        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
