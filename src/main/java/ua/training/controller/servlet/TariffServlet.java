package ua.training.controller.servlet;

import ua.training.model.entity.Client;
import ua.training.model.entity.Tariff;
import ua.training.model.entity.TariffType;
import ua.training.comparator.TariffComparator;
import ua.training.model.entity.builder.tariffBuilder.BuilderManager;
import ua.training.model.entity.builder.tariffBuilder.StandardTariffBuilder;
import ua.training.model.entity.builder.tariffBuilder.TariffBuilder;
import ua.training.utils.TariffUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class TariffServlet extends HttpServlet {
    private final static String index = "/WEB-INF/view/index.jsp";
    BuilderManager builderManager=new BuilderManager();
    TariffBuilder standard1=new StandardTariffBuilder();

    private List<Tariff> tariffs;
    private Tariff premium = TariffUtil.getPremiumTariff();
    private Tariff standard = TariffUtil.getStandardTariff();
    private Tariff internetPremium = TariffUtil.getInternetPremiumTariff();
    private Tariff internetStandard = TariffUtil.getInternetStandardTariff();
    private List<Client>clients;
    @Override
    public void init() throws ServletException {
        tariffs = new CopyOnWriteArrayList<>();
        clients=new CopyOnWriteArrayList<>();
        tariffs.add(premium);
        tariffs.add(standard);
        tariffs.add(internetPremium);
        tariffs.add(internetStandard);
        clients.add(new Client(TariffType.INTERNET_PREMIUM, "Antonio", "8-800-555-35-35"));
        clients.add(new Client(TariffType.STANDARD, "Sean", "8-800-555-35-35"));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setAttribute("tariffs", tariffs);
        Collections.sort(tariffs, new TariffComparator());
        req.setAttribute("clients", clients);
        req.setAttribute("amountOfClients", new String("Amount of clients "+ TariffUtil.clientAmount(clients)));



        req.getRequestDispatcher(index).forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF8");
        final String monthFeeFrom = req.getParameter("monthFeeFrom");
        final String monthFeeTo = req.getParameter("monthFeeTo");
        req.setAttribute("foundTariffs", TariffUtil.searchTariffWithinDiapasone(tariffs, Double.parseDouble(monthFeeFrom), Double.parseDouble(monthFeeTo)));
        doGet(req, resp);



    }
}
