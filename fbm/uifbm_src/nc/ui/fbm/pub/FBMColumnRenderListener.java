package nc.ui.fbm.pub;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

import nc.ui.fac.account.pub.IRefTakenProccessor;
import nc.ui.pub.beans.UITable;
import nc.ui.pub.beans.table.IMutilSortableTableModel;
import nc.ui.pub.beans.table.ISortableTableModel;
import nc.ui.pub.beans.table.ITableModel;
import nc.ui.pub.bill.BillCardPanel;
import nc.ui.pub.bill.BillItem;
import nc.ui.pub.bill.BillListPanel;
import nc.ui.pub.bill.BillModel;
import nc.vo.pub.lang.UFDate;

/**
 * ��Ⱦ�еļ�����
 * @author xwq
 *
 */
public class FBMColumnRenderListener extends MouseAdapter{
	
	private BillListPanel listpanel;
	private BillCardPanel cardpanel;
	private IRefTakenProccessor process;
	
	public FBMColumnRenderListener(BillListPanel listpanel,BillCardPanel cardpanel,IRefTakenProccessor process){
		this.listpanel = listpanel;
		this.cardpanel = cardpanel;
		this.process = process;
	}
	
	 public void mouseClicked(java.awt.event.MouseEvent e){
		 TableModel model = listpanel.getParentListPanel().getTable().getModel();
		 UITable table = listpanel.getParentListPanel().getTable();
			if (e.getClickCount() == 1 && e.getButton() != MouseEvent.BUTTON3 && !table.isEditing() && table.isSortEnabled()
					&& (model instanceof ISortableTableModel || model instanceof ITableModel || model instanceof IMutilSortableTableModel))
			{
				
				TableColumnModel tcm = table.getColumnModel();
				int vc = tcm.getColumnIndexAtX(e.getX());
				int mc = convertColumnIndexToModel(vc);
				if(model instanceof BillModel) {
					String key = ((BillModel)model).getBodyKeyByCol(vc);
					int rowCount = model.getRowCount();
					if (rowCount == 0)
						return ;
					BillItem item = ((BillModel)model).getItemByKey(key);
					
					
					Object value = null;
					for(int i = 0 ; i < rowCount;i++){
						Object obj = ((BillModel)model).getValueAt(i, mc);
						if(obj != null){
							continue;
						}
						obj = process.renderCell(value, i, vc, item, (BillModel)model);
						if(obj instanceof UFDate){
							UFDate date = (UFDate)obj;
							if(date !=null){
								((BillModel)model).setValueAt(date.toString(), i, mc);
							}
						}else{
							((BillModel)model).setValueAt(obj, i, mc);
						}
					}
					
				}
				
				
				
			}
	 }
	 
	    public int convertColumnIndexToModel(int viewColumnIndex) {
	        if (viewColumnIndex < 0) {
	            return viewColumnIndex;
	        }
	        return listpanel.getParentListPanel().getTable().getColumnModel().getColumn(viewColumnIndex).getModelIndex();
	    }
}
