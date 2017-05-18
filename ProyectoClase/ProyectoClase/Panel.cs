using System;
using System.Collections.Generic;
using Gtk;

namespace ProyectoClase
{
	public class Panel
	{
		private static readonly Gdk.Color COLOR_RED = new Gdk.Color (255, 0, 0);
		private	Table table = new Table (9, 10, true);
		private IList<Button> buttons = new List<Button> ();
		public Panel () 
		{
			for (int index = 0; index < 90; index ++) {
				Button button = new Button ();
				int numero = index + 1;
				button.Label = numero.ToString();
				button.Visible = true;
				uint row = (uint)index / 10;
				uint column = (uint)index % 10;
				table.Attach (button, column, column + 1, row, row + 1);
				buttons.Add (button);
			}
			table.Visible = true;
		}

		public void MarcarNumero(int numero) {
			buttons [numero - 1].ModifyBg (StateType.Normal, COLOR_RED);
		}
				
		public Table Table {
			get { return table; }
		}
	
	}

}

