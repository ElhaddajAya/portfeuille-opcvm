package entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data

@Entity
@Table(name = "cours")
public class Cours {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

	@Temporal(TemporalType.DATE)
	@Column(nullable = false)
    private Date date;

    private double cout;

    @ManyToOne
    @JoinColumn(name = "portefeuille_id")
    private Portefeuille portefeuille;

	public Cours(Long id, Date date, double cout, Portefeuille portefeuille) {
		super();
		this.id = id;
		this.date = date;
		this.cout = cout;
		this.portefeuille = portefeuille;
	}

	public Cours() {
		super();
	}

	public Cours(Date date, double cout, Portefeuille portefeuille) {
		super();
		this.date = date;
		this.cout = cout;
		this.portefeuille = portefeuille;
	}

}
