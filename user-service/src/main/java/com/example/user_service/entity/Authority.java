package com.example.user_service.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "authorities")
public class Authority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer authorityId;
    @Column(unique = true)
    private String authorityName;

    public Authority() {
    }

    public Authority(Integer authorityId, String authorityName) {
        this.authorityId = authorityId;
        this.authorityName = authorityName;
    }

    public Integer getAuthorityId() {
        return authorityId;
    }

    public void setAuthorityId(Integer authorityId) {
        this.authorityId = authorityId;
    }

    public String getAuthorityName() {
        return authorityName;
    }

    public void setAuthorityName(String authorityName) {
        this.authorityName = authorityName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Authority authority = (Authority) o;
        return Objects.equals(authorityId, authority.authorityId) && Objects.equals(authorityName, authority.authorityName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorityId, authorityName);
    }

    @Override
    public String toString() {
        return "Authority{" +
                "authorityId=" + authorityId +
                ", authorityName='" + authorityName + '\'' +
                '}';
    }
}
