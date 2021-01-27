package employeemanagement;

public enum GenderType {
    MALE(1), FEMALE(2), UNKNOWN(3);

    int monthOrdinal = 0;

    GenderType(int ord) {
        this.monthOrdinal = ord;
    }

    public static GenderType byOrdinal(int ord) {
        for (GenderType m : GenderType.values()) {
            if (m.monthOrdinal == ord) {
                return m;
            }
        }
        return null;
    }

}
