public abstract class Game_Check_Exception extends RuntimeException{
    final String errorMessage;

    protected Game_Check_Exception(String errorMessage) {
        this.errorMessage = errorMessage;
    }
    @Override
    public String toString() {
        return errorMessage;
    }

    static class EmptyFieldException extends Game_Check_Exception {
        protected EmptyFieldException() {
            super("Pole nie może być puste");
        }
    }

    static class EmptyTitleException extends EmptyFieldException {}
    static class EmptySerException extends EmptyFieldException {}
    static class EmptyValException extends EmptyFieldException {}
    static class EmptyCreException extends EmptyFieldException {}
    static class EmptySearchException extends EmptyFieldException{}

    static class NoPickedTypeException extends Game_Check_Exception {
        protected NoPickedTypeException() {
            super("Pole musi zostać wybrane");
        }
    }

    static class NoActualizationPossible extends Game_Check_Exception {
        protected NoActualizationPossible() {
            super("Nie mogę zaakualizować pola");
        }
    }

    static class NoFollowedException extends Game_Check_Exception {
        protected NoFollowedException() {
            super("Nie dodałeś żadnej obserwacji");
        }
    }

    static class InvalidValueException extends Game_Check_Exception {
        protected InvalidValueException() {
            super("Proszę użyć liczb z przedziału od 0 do 100");
        }
    }

    static class NoSearchPossibleException extends Game_Check_Exception {
        protected NoSearchPossibleException() {
            super("Nie ma takiej pozycji w bazie danych");
        }
    }
}
