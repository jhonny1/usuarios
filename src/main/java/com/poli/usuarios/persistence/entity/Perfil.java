package com.poli.usuarios.persistence.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Getter
@Setter
@Entity
@Table(name = "perfiles")

public class Perfil {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)

   @Column(name = "id")
   private Integer id_pe;
   @Column(name = "Perfiln")
   private String perfiln;
   @JsonBackReference
   @ManyToOne(fetch = FetchType.EAGER)
   @JoinColumn(name = "usuario_id")
   private Usuario usuario;


   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Perfil perfil = (Perfil) o;
      return Objects.equals(id_pe, perfil.id_pe);
   }

   @Override
   public int hashCode() {
      return Objects.hash(id_pe);
   }
}

