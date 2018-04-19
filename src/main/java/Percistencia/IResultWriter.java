package Percistencia;

import Model.ResultModel;

/**
 * Created by Yo on 17/4/2018.
 */
public interface IResultWriter extends IWriter<ResultModel> {

    public void add(ResultModel r);

}
