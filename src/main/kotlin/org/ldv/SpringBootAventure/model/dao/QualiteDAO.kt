package org.ldv.SpringBootAventure.model.dao

import org.ldv.SpringBootAventure.model.entity.Qualite
import org.springframework.data.jpa.repository.JpaRepository

interface QualiteDAO: JpaRepository<Qualite,Long> {
}