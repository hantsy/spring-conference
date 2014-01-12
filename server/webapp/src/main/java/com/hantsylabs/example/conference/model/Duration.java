package com.hantsylabs.example.conference.model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import static com.hantsylabs.example.conference.Predicates.*;

@Embeddable
public class Duration implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(style = "M-")
	private Date start;

	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(style = "M-")
	private Date end;
	
	public Duration() {}
	
	public Duration(Date start) {
        nonNull(start, "Start must be specified");

        Calendar cal=Calendar.getInstance();
        cal.setTime(start);
        cal.set(Calendar.HOUR_OF_DAY, 23);
        cal.set(Calendar.MINUTE, 59);
        cal.set(Calendar.SECOND, 59);
        
        this.end=cal.getTime();
        this.start = (Date)start.clone();
    }
	
	public Duration(Date start, Date end) {
        nonNull(start, "Start must be specified");
        nonNull(end, "End must be specified");
        if (end.before(start)) {
            throw new IllegalArgumentException("End can not be before Start");
        }
        this.start = (Date)start.clone();
        this.end = (Date)end.clone();
    }

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getEnd() {
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}

}
