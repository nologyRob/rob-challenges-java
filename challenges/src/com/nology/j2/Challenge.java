package com.nology.j2;

public class Challenge {
    public Challenge() {
    }

    // BEGINNER

    /***
     * Write a method that concatenates two strings together with a space in between them.
     * @param firstName
     * @param lastName
     * @return returns a string which is the concatenation of the 2 poarameters
     */
    public String makeFullName(String firstName, String lastName) {
        return firstName + " " +  lastName;
    }

    /***
     * Write a method called printMegaBytesAndKiloBytes that has 1 parameter of type int with the name kiloBytes.
     * Then it needs to print a message in the format "XX KB = YY MB and ZZ KB".
     * @param kiloBytes the number of kilobytes to be converted
     * @return returns a string in the format above if the input is valid, or "Invalid value" if the kiloBytes param is less than 0
     */
    public String printMegaBytesAndKiloBytes(int kiloBytes) {
        if(kiloBytes < 0) {
            return "Invalid Value";
        } else {
            int megaBytes = (kiloBytes / 1024);
            int remainder = (kiloBytes % 1024);
            return kiloBytes + " KB = " + megaBytes + " MB and " + remainder + " KB";
        }
    }

    /***
     * We have a dog that likes to bark.  We need to wake up if the dog is barking at night!
     * @param barking type boolean and be named barking it represents if our dog is currently barking.
     * @param hourOfDay represents the hour of the day and is of type int with the name hourOfDay and has a valid range of 0-23.
     * @return We have to wake up if the dog is barking before 8 or after 22 hours so in that case return true. In all other cases return false.
     */
    public boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if((hourOfDay < 0) || (hourOfDay > 23)) {
            return false;
        } else if(barking  && (hourOfDay < 8 || hourOfDay > 22)) {
            return true;
        }
        return false;
    }
}
