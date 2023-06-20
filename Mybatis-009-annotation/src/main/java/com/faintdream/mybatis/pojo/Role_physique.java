package com.faintdream.mybatis.pojo;

public class Role_physique {

    private String no;
    private String physique;
    private String physique_c;

    public Role_physique(String no, String physique, String physique_c) {
        this.no = no;
        this.physique = physique;
        this.physique_c = physique_c;
    }

    public Role_physique() {
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getPhysique() {
        return physique;
    }

    public void setPhysique(String physique) {
        this.physique = physique;
    }

    public String getPhysique_c() {
        return physique_c;
    }

    public void setPhysique_c(String physique_c) {
        this.physique_c = physique_c;
    }

    @Override
    public String toString() {
        return "Role_physiqueMapper{" +
                "no='" + no + '\'' +
                ", physique='" + physique + '\'' +
                ", physique_c='" + physique_c + '\'' +
                '}';
    }
}
