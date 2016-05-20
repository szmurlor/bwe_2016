package magazyn;

import logika.DostawaTO;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.WebPage;

import java.text.SimpleDateFormat;
import java.util.List;

public class HomePage extends BasePage {
	private static final long serialVersionUID = 1L;

	public HomePage(final PageParameters parameters) {
		super(parameters);

		List<DostawaTO> listaDostaw = ((WicketApplication) WicketApplication.get()).getBWEDAO().getDostawy();
		add(new ListView<DostawaTO>("list", listaDostaw) {
			@Override
			protected void populateItem(ListItem<DostawaTO> item) {
				DostawaTO d = item.getModelObject();
				item.add( new Label("idx", String.valueOf(item.getIndex() + 1)));
				item.add( new Label("data", new SimpleDateFormat("dd.MM.yyyy").format(d.getDataDostawy())));
				item.add( new Label("stanowisko", d.getStanowiskoBWE()));
				item.add( new Label("nrrej", d.getNrRejestracyjny()));
				item.add( new Label("rodzajpojazdu", d.getTypPojazdu()));
				item.add( new Label("liczbapalet", String.valueOf(d.getLiczbaPalet())));
			}
		});

    }
}
