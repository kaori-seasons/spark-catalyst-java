package org.apache.spark.sql.catalyst.plans.logical.statistics;

/**
 * Created by chengxy on 2023/03/1.
 */
public class HistogramBin {
    Double lo;
    Double hi;
    Double ndv;
    public HistogramBin(Double lo,
            Double hi,
            Double ndv){
        this.lo = lo;
        this.hi = hi;
        this.ndv= ndv;
    }
}
