package com.companyName.projectName;

public User implements Serializable {
    /** Serial Version UID */
    private static final long serialVersionUID = 1L;

            private int id;
            private String firstName;
            private String lastName;
            private LocalDate dob;
    
            public int get${property.getGetterAndSetterField()}(){
            return this.id;
        }

        public void set${property.getGetterAndSetterField()}(int id){
            this.id = id;
        }
            public String get${property.getGetterAndSetterField()}(){
            return this.firstName;
        }

        public void set${property.getGetterAndSetterField()}(String firstName){
            this.firstName = firstName;
        }
            public String get${property.getGetterAndSetterField()}(){
            return this.lastName;
        }

        public void set${property.getGetterAndSetterField()}(String lastName){
            this.lastName = lastName;
        }
            public LocalDate get${property.getGetterAndSetterField()}(){
            return this.dob;
        }

        public void set${property.getGetterAndSetterField()}(LocalDate dob){
            this.dob = dob;
        }
    }