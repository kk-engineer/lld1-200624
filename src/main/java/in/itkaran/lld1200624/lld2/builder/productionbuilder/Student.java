package in.itkaran.lld1200624.lld2.builder.productionbuilder;

public class Student {
    private String name;
    private int age;
    private String batch;
    private String phoneNum;
    private String email;
    private String univName;
    private  int gradYear;
    private Double psp;

    private Student(Helper builder) {
        this.name = builder.getName();
        this.age = builder.getAge();
        this.batch = builder.getBatch();
        this.phoneNum = builder.getPhoneNum();
        this.email = builder.getEmail();
        this.univName = builder.getUnivName();
        this.gradYear = builder.getGradYear();
        this.psp = builder.getPsp();
    }

    public static Helper getBuilder() {
        return new Helper();
    }

    public static class Helper {
        private String name;
        private int age;
        private String batch;
        private String phoneNum;
        private String email;
        private String univName;
        private  int gradYear;
        private Double psp;

        // Setters


        public Helper setName(String name) {
            this.name = name;
            return this;
        }

        public Helper setAge(int age) {
            this.age = age;
            return this;
        }

        public Helper setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public Helper setPhoneNum(String phoneNum) {
            this.phoneNum = phoneNum;
            return this;
        }

        public Helper setEmail(String email) {
            this.email = email;
            return this;
        }

        public Helper setUnivName(String univName) {
            this.univName = univName;
            return this;
        }

        public Helper setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public Helper setPsp(Double psp) {
            this.psp = psp;
            return this;
        }

        // Getters


        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getBatch() {
            return batch;
        }

        public String getPhoneNum() {
            return phoneNum;
        }

        public String getEmail() {
            return email;
        }

        public String getUnivName() {
            return univName;
        }

        public int getGradYear() {
            return gradYear;
        }

        public Double getPsp() {
            return psp;
        }

        public Student build() {
            // Validations
            if (this.getGradYear() < 2024) {
            throw new RuntimeException("Grad year must be >= 2024");
        }

        if (this.getPsp() < 70) {
            throw new RuntimeException("PSP must be >= 70");
        }
            return new Student(this);
        }
    }
}
